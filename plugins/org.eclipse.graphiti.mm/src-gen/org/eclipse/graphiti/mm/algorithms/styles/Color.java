/**
 * <copyright>
 * 
 * Copyright (c) 2005, 2011 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 * 
 * </copyright>
 */
package org.eclipse.graphiti.mm.algorithms.styles;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Color</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.graphiti.mm.algorithms.styles.Color#getRed <em>Red</em>}</li>
 *   <li>{@link org.eclipse.graphiti.mm.algorithms.styles.Color#getGreen <em>Green</em>}</li>
 *   <li>{@link org.eclipse.graphiti.mm.algorithms.styles.Color#getBlue <em>Blue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.graphiti.mm.algorithms.styles.StylesPackage#getColor()
 * @model
 * @generated
 */
public interface Color extends EObject {
	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see org.eclipse.graphiti.mm.algorithms.styles.StylesPackage#getColor_Red()
	 * @model unique="false" required="true" ordered="false"
	 *        suppressedSetVisibility="true"
	 * @generated
	 */
	int getRed();

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see org.eclipse.graphiti.mm.algorithms.styles.StylesPackage#getColor_Green()
	 * @model unique="false" required="true" ordered="false"
	 *        suppressedSetVisibility="true"
	 * @generated
	 */
	int getGreen();

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see org.eclipse.graphiti.mm.algorithms.styles.StylesPackage#getColor_Blue()
	 * @model unique="false" required="true" ordered="false"
	 *        suppressedSetVisibility="true"
	 * @generated
	 */
	int getBlue();

} // Color
