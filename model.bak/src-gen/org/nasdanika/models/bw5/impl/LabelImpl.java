/**
 */
package org.nasdanika.models.bw5.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.bw5.Bw5Package;
import org.nasdanika.models.bw5.Label;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.impl.LabelImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.LabelImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.LabelImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.LabelImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.LabelImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.LabelImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.LabelImpl#getFade <em>Fade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends NodeImpl implements Label {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected static final String THICKNESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFade() <em>Fade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFade()
	 * @generated
	 * @ordered
	 */
	protected static final String FADE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw5Package.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return (Integer)eDynamicGet(Bw5Package.LABEL__WIDTH, Bw5Package.Literals.LABEL__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		eDynamicSet(Bw5Package.LABEL__WIDTH, Bw5Package.Literals.LABEL__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return (Integer)eDynamicGet(Bw5Package.LABEL__HEIGHT, Bw5Package.Literals.LABEL__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		eDynamicSet(Bw5Package.LABEL__HEIGHT, Bw5Package.Literals.LABEL__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFontColor() {
		return (String)eDynamicGet(Bw5Package.LABEL__FONT_COLOR, Bw5Package.Literals.LABEL__FONT_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontColor(String newFontColor) {
		eDynamicSet(Bw5Package.LABEL__FONT_COLOR, Bw5Package.Literals.LABEL__FONT_COLOR, newFontColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return (String)eDynamicGet(Bw5Package.LABEL__COLOR, Bw5Package.Literals.LABEL__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		eDynamicSet(Bw5Package.LABEL__COLOR, Bw5Package.Literals.LABEL__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return (String)eDynamicGet(Bw5Package.LABEL__TYPE, Bw5Package.Literals.LABEL__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		eDynamicSet(Bw5Package.LABEL__TYPE, Bw5Package.Literals.LABEL__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThickness() {
		return (String)eDynamicGet(Bw5Package.LABEL__THICKNESS, Bw5Package.Literals.LABEL__THICKNESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThickness(String newThickness) {
		eDynamicSet(Bw5Package.LABEL__THICKNESS, Bw5Package.Literals.LABEL__THICKNESS, newThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFade() {
		return (String)eDynamicGet(Bw5Package.LABEL__FADE, Bw5Package.Literals.LABEL__FADE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFade(String newFade) {
		eDynamicSet(Bw5Package.LABEL__FADE, Bw5Package.Literals.LABEL__FADE, newFade);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bw5Package.LABEL__WIDTH:
				return getWidth();
			case Bw5Package.LABEL__HEIGHT:
				return getHeight();
			case Bw5Package.LABEL__FONT_COLOR:
				return getFontColor();
			case Bw5Package.LABEL__COLOR:
				return getColor();
			case Bw5Package.LABEL__TYPE:
				return getType();
			case Bw5Package.LABEL__THICKNESS:
				return getThickness();
			case Bw5Package.LABEL__FADE:
				return getFade();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bw5Package.LABEL__WIDTH:
				setWidth((Integer)newValue);
				return;
			case Bw5Package.LABEL__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case Bw5Package.LABEL__FONT_COLOR:
				setFontColor((String)newValue);
				return;
			case Bw5Package.LABEL__COLOR:
				setColor((String)newValue);
				return;
			case Bw5Package.LABEL__TYPE:
				setType((String)newValue);
				return;
			case Bw5Package.LABEL__THICKNESS:
				setThickness((String)newValue);
				return;
			case Bw5Package.LABEL__FADE:
				setFade((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Bw5Package.LABEL__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Bw5Package.LABEL__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Bw5Package.LABEL__FONT_COLOR:
				setFontColor(FONT_COLOR_EDEFAULT);
				return;
			case Bw5Package.LABEL__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case Bw5Package.LABEL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Bw5Package.LABEL__THICKNESS:
				setThickness(THICKNESS_EDEFAULT);
				return;
			case Bw5Package.LABEL__FADE:
				setFade(FADE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Bw5Package.LABEL__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case Bw5Package.LABEL__HEIGHT:
				return getHeight() != HEIGHT_EDEFAULT;
			case Bw5Package.LABEL__FONT_COLOR:
				return FONT_COLOR_EDEFAULT == null ? getFontColor() != null : !FONT_COLOR_EDEFAULT.equals(getFontColor());
			case Bw5Package.LABEL__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case Bw5Package.LABEL__TYPE:
				return TYPE_EDEFAULT == null ? getType() != null : !TYPE_EDEFAULT.equals(getType());
			case Bw5Package.LABEL__THICKNESS:
				return THICKNESS_EDEFAULT == null ? getThickness() != null : !THICKNESS_EDEFAULT.equals(getThickness());
			case Bw5Package.LABEL__FADE:
				return FADE_EDEFAULT == null ? getFade() != null : !FADE_EDEFAULT.equals(getFade());
		}
		return super.eIsSet(featureID);
	}

} //LabelImpl
