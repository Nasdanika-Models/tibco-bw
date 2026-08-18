
```drawio-resource
../bw.drawio
```

[TOC levels=6]

An [Ecore](https://ecore.models.nasdanika.org/) model of TIBCO ActiveMatrix BusinessWorks 5.x: projects, folders, process definitions, starters, activities, groups, transitions, process variables, and the calls between processes - loaded directly from the artifacts a BW5 estate already has on disk, and placed on the [Nasdanika micro-model tower](https://nasdanika.com/models.html) so that the estate it describes is documented, owned, staged, governed, and worked on without a second system of record.

BW5 is past end of standard support and the vendor's path leads to BW 6 / BusinessWorks Container Edition, yet the estates are still in production, still integrating everything to everything, and still largely undocumented outside the Designer canvas. The interesting problem is not "convert this process"; it is "what do we have, who owns it, what does it touch, what is it worth, and in what order do we retire it". That problem is [legacy modernization analysis](https://docs.nasdanika.org/practices/legacy-modernization/analysis.html), and on the tower it is not a separate exercise with a separate spreadsheet: it is instance data on the same model that documents the processes.

## What the model captures

BW5 vocabulary, named the way BW5 practitioners name it, so that a Designer user reads the generated documentation without a glossary:

| Area | Types |
|------|-------|
| Project structure | [`Project`](references/eClassifiers/Project/index.html), [`Folder`](references/eClassifiers/Folder/index.html), [`Resource`](references/eClassifiers/Resource/index.html) (`projectPath`, `fileName`) |
| Process | [`ProcessDefinition`](references/eClassifiers/ProcessDefinition/index.html) (`targetNamespace`, error schemas, return bindings), [`ProcessVariable`](references/eClassifiers/ProcessVariable/index.html) |
| Steps | [`Activity`](references/eClassifiers/Activity/index.html) (`type`, `resourceType`, `config`, `inputBindings`), [`Starter`](references/eClassifiers/Starter/index.html), [`Group`](references/eClassifiers/Group/index.html) (loops, scopes, error handlers) |
| Flow | [`Transition`](references/eClassifiers/Transition/index.html) (`conditionType`, `condition`), [`Node`](references/eClassifiers/Node/index.html) with incoming and outgoing transitions, synthetic `start` / `end` |
| Inter-process | [`Call`](references/eClassifiers/Call/index.html), [`Caller`](references/eClassifiers/Caller/index.html), [`CallTarget`](references/eClassifiers/CallTarget/index.html) |
| Canvas | [`Label`](references/eClassifiers/Label/index.html), `x` / `y` / geometry on every node |
| XML reality | [`NamespaceAware`](references/eClassifiers/NamespaceAware/index.html) - prefix/URI maps preserved per element |

Two deliberate choices shape it. `Group extends Activity, Container` - a BW5 group is both a step and a scope, which is why loops nest and why a flat activity list is the wrong shape. And activity configuration, input bindings, and return bindings are kept as **raw XML text plus their namespace maps** rather than being modeled per activity type. There are hundreds of palette types across the base product and every adapter ever installed; typing them all is a career, and inventory-grade analysis does not need it. The text is a lossless escape hatch: an XPath over `config` answers "which JDBC activities point at the decommissioned database", and any activity type that turns out to deserve typed features can be subclassed later without touching what already loads.

## Loading a real project

`.process` files are ordinary EMF resources. The [capability](https://docs.nasdanika.org/core/capability/index.html) framework registers a resource factory for the `process` extension, so a process is a URI:

```java
ResourceSet resourceSet = capabilityLoader.loadOne(
        ServiceCapabilityFactory.createRequirement(ResourceSet.class), progressMonitor);
Project project = new Bw5ProjectLoader(resourceSet).loadProject(new File(projectDir));
```

* `Bw5ProcessLoader` is a StAX parser over the `pd:ProcessDefinition` namespace (`http://xmlns.tibco.com/bw/process/2003`), hardened against XXE, resolving transitions to nodes by name within each container and each group.
* `Bw5ProjectLoader` walks a project directory into `Folder` / `Resource` trees. Anything with a registered extension is parsed into typed model elements; everything else - `.wsdl`, `.aeschema`, `.substvar`, `.sharedjmscon`, `.sharedhttp`, `.serviceagent`, `.archive`, `.projlib` - still lands in the tree as a plain `Resource`, so the inventory is complete even where the parsing is not. Loading of `vcrepo.dat` and `.folder` metadata is still a to-do.
* `org.nasdanika.models.bw5.graph` turns the loaded model into a [graph](https://docs.nasdanika.org/core/graph/index.html) of nodes and connections - activity nodes, transition connections, call connections - which is what the documentation generator and any traversal-based analysis run on.

## Position in the tower

The aspect spine runs `nxcore < role < iam < seal < lifecycle < decision analysis < decision binding < governance < work < architecture < threat`, each floor extending the one below. BW5 is an **estate model** and branches off [threat](https://threat.models.nasdanika.org/), following the placement rule the [architecture model](https://architecture.models.nasdanika.org/) states for estate models with a security surface: a BW5 `Resource` is an `Asset`, hence an architecture `Element`, hence `Workable`, `Governed`, and an nxcore `ModelElement`.

Nothing in the list below is BW5 code. It is what a process definition acquires by being attached at that point:

| Floor | What a BW5 resource gets |
|-------|--------------------------|
| [nxcore](https://nxcore.models.nasdanika.org/) | Documentation, doc sections, icons, alias URIs, and `Marker` / `GitMarker` provenance - repository, branch, commit, path, digest, per element and per feature |
| [role](https://role.models.nasdanika.org/) | Owner, SME, reviewer, custodian as time-boxed `Role`s with `RoleAssignment`s to actors and actor domains - ownership that has a start and an end date, which is what ownership of a legacy estate actually looks like |
| [iam](https://iam.models.nasdanika.org/) / [seal](https://seal.models.nasdanika.org/) | Who may see what, and element-level sealing - a published estate site can carry endpoint inventories and connection details for the platform team while the public view simply does not contain them |
| [lifecycle](https://lifecycle.models.nasdanika.org/) | Stages and sojourns: *discovered → assessed → dispositioned → in migration → parallel run → decommissioned*, with the history of when each artifact entered each stage, not just its current label |
| [decision analysis](https://decision-analysis.models.nasdanika.org/) / [binding](https://decision-binding.models.nasdanika.org/) | The R-menu - rehost, replatform, refactor, rearchitect, rebuild, replace, retain, retire - as `Alternative`s scored against `Criterion`s, with the chosen one *bound* at a variation point, so the ADR and the model cannot drift apart |
| [governance](https://governance.models.nasdanika.org/) | Risks with inherent and residual levels, controls, control applications with evidence, findings, and waivers - "we knowingly run this unsupported until Q3, here is who signed" becomes a typed record |
| [work](https://work.models.nasdanika.org/) | The migration backlog attached *to the artifact*, with dependencies, estimates, and roll-up - not a tracker ticket whose summary mentions a file name |
| [architecture](https://architecture.models.nasdanika.org/) | Containment, reified relationships, kinds as data, and `ElementReference` federation to the systems BW5 integrates |
| [threat](https://threat.models.nasdanika.org/) | Weaknesses and threats on the artifact: plaintext protocols in an HTTP or JMS activity, credentials in `config`, a process crossing a trust boundary with no authentication |

This is the whole argument for the refactoring. Modernization analysis normally produces a spreadsheet whose columns are exactly these aspects - owner, disposition, risk, target state, effort, sequence - maintained by hand, next to a model that knows nothing about them. Here the columns are the tower, the rows are the loaded artifacts, and both are the same model.

## Scenario: repository scan to governed migration backlog

The end-to-end use the model is built for. Every step is a model transformation; the deliverables are generated views.

1. **Scan.** Walk the source forges with the [GitLab](https://gitlab.models.nasdanika.org/) model - users, groups, projects, repositories, branches, commits - and its `gitlab://` URI handler. Every repository containing a `vcrepo.dat` is a BW5 project; load it in place, no clone-and-parse pipeline.
2. **Inventory the footprint.** The result is a single model: *n* projects, *m* processes, the activity-type histogram, the starter inventory (which processes are entry points, and over which protocol), the call graph across processes, and the long tail of unparsed resource types. `GitMarker` keeps every element traceable to repository, branch, commit, and path, so the next scan is a **model diff** rather than a fresh spreadsheet.
3. **Assign owners.** Join to the org: GitLab `CODEOWNERS` and commit history give candidates, the people/org model gives the hierarchy, and the [role](https://role.models.nasdanika.org/) model records the outcome as time-boxed engagements. Unowned artifacts are a query, and that query is usually the most valuable page of the whole report.
4. **Score and risk-rate.** Size, fan-in and fan-out from the call graph, activity-type mix, last-commit age, and `config` probes (deprecated adapters, hard-coded endpoints, embedded credentials) roll up into governance `Risk`s and threat `Weakness`es on the artifacts themselves.
5. **Decide dispositions.** Run the R-menu as a decision analysis per process, or per cluster of processes, with criteria the organization actually argues about - business criticality, coupling, licence exposure, availability of a target service - and bind the winner. The record of *why* sits in the model next to the thing decided.
6. **Stage and plan.** Move artifacts through lifecycle stages as the programme proceeds and attach `Work` to them; dependencies fall out of the call graph, because a process cannot be retired before its callers, which the model knows and a spreadsheet does not.
7. **Publish and re-run.** Generate the site; re-scan on a schedule. Burn-down of the legacy footprint over time, per-owner rollups, and "what changed in the estate this month" are queries over the same model, not a fresh consulting engagement.

## Applications

* **Educational.** The generated site is a readable tour of what a BW5 process *is* - starters, groups, transitions with conditions, inter-process calls - for the people who inherited the estate and never had the Designer. The instructive exercise is the second half: take one real project, load it, then fill in owners, stages, risks, and dispositions. The fields you cannot honestly fill in are the finding.
* **Documentation generation.** The doc module generates a per-project site: a page per folder, process, group, and activity, with **Draw.io diagrams rendered from the canvas coordinates already present in the `.process` file**, so the generated picture is the picture the developer drew. Plus call-graph navigation, search, and the option to publish behind IAM. This is the answer to "the documentation is a Word file from 2014".
* **Tracking migration.** One model instance carries the as-is estate and the programme state on top of it. Reporting is generation, and the register cannot drift from the code, because the register *is* the code, re-scanned.
* **Continuous inventory.** In CI, a scan plus a diff produces "three processes added, one starter now exposed over plain HTTP, two processes still unowned" as a build artifact.

## Competitive landscape

Five camps, none of which occupies this position:

**Vendor migration tooling.** TIBCO's own BW5-to-BW6 / BWCE migration utilities convert projects. Useful, and orthogonal: conversion assumes the decision is already made, produces no inventory, no ownership, and no risk register, and says nothing about the sizeable fraction of processes that should be retired rather than converted.

**SI assessment accelerators.** Every large integrator has a BW5 "modernization factory": internal parsers, a complexity-scoring spreadsheet, a wave plan, and a slide deck. The output can be genuinely good, and it is a deliverable rather than an asset - the parser stays with the vendor, the spreadsheet is stale the week after handover, and the next engagement begins by scanning again.

**Application portfolio management and EA platforms.** LeanIX, Ardoq, Bizzdesign, Software AG Alfabet, ServiceNow APM. Right altitude - portfolio, TIME/R disposition, lifecycle, owner, cost - and wrong resolution: the finest grain is "the application", populated by survey, and nothing connects a portfolio row to the `.process` file that would make it true. Proprietary repository, per-seat, and the crosswalk to risk and architecture is manual.

**Code analysis and modernization platforms.** SonarQube, CAST Highlight and Imaging, vFunction, Moderne/OpenRewrite, IBM watsonx Code Assistant, Amazon Q Code Transformation. These do real artifact-resolution analysis, but for mainstream languages and frameworks; a proprietary XML estate like BW5 is invisible to them. Their output is metrics and refactorings rather than a governed inventory, and the model is theirs.

**LLM archaeology.** Pointing a model at a `.process` file and asking what it does works surprisingly well - per file, once. There is no register, no diff, no ownership, and no memory. It is an excellent *reader* for this model, drafting `documentation` and disposition rationales, and a poor substitute for one.

And the actual competitor, as everywhere in this stack: an XPath script, an Excel workbook with a tab per project, and a PowerPoint wave plan that were mutually inconsistent on the day they were filed.

The position claimed here is the intersection nobody sells: **artifact-resolution parsing feeding a portfolio-grade register, in an open metamodel you own, in git, with the documentation generated from it.**

## A case study for other legacy technologies

The BW5-specific part of this repository is about twenty classes and two loaders. Everything that makes it useful - ownership, lifecycle, risk, decisions, work, access control, provenance, site generation - is inherited. That ratio is the point, and it generalizes as a recipe:

1. Parse the platform's **own artifacts**; keep opaque payloads as text with their namespaces, and type only what analysis needs.
2. Name the concepts the way the platform's practitioners name them, so the generated documentation needs no glossary.
3. Attach at the estate point on the tower and inherit the analysis aspects instead of inventing columns.
4. Record provenance with markers, so a re-scan is a diff.
5. Generate the documentation; never write it.

The obvious next candidates are the estates that share BW5's shape - proprietary artifacts, a vendor tool nobody installs any more, and a workforce that retired: mainframe COBOL/JCL/CICS with copybooks, Oracle Forms and Reports over PL/SQL packages, PowerBuilder, VB6/VBA and Access, Lotus Notes/Domino, SAP ABAP Z-code, ETL estates (Informatica PowerCenter, DataStage, SSIS), the sibling integration platforms (webMethods, IBM Integration Bus/ACE with MQ, BizTalk orchestrations, Mule 3), and report estates such as Crystal and BusinessObjects. Several neighbouring models already exist and compose with this one - [Maven](https://maven.models.nasdanika.org/), [Java](https://java.models.nasdanika.org/), [SQL](https://sql.models.nasdanika.org/), [GitLab](https://gitlab.models.nasdanika.org/), [Jira](https://jira.models.nasdanika.org/), [Excel](https://excel.models.nasdanika.org/) - so a mixed estate is one model with several loaders rather than several tools with several spreadsheets.

## BW 6

A [BW 6 model](https://github.com/Nasdanika-Models/bw6) is also available: BPEL 2.0 vocabulary with TIBCO extensions - `Process`, `ProcessInfo`, `ProcessInterface`, `PartnerLink`, `Variable`, `Scope`, `Flow`, `Link`, `Activity` - and a StAX loader for `.bwp` files registered on the `bwp` extension.

Two caveats, stated plainly: it is **not tested** beyond a smoke test, and it is currently a standalone model rather than a floor on the tower, so it inherits none of the aspects described above. It is nonetheless the other half of the migration story worth having: as-is BW5 and to-be BW6 in one model, with `Work` and decision bindings connecting a retiring process to the one that replaces it, and one generated site covering both.
