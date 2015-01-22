/**
 * Copyright (c) 2015 Source Auditor Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
*/
package org.spdx.rdfparser.model;

import org.spdx.rdfparser.IModelContainer;

import com.hp.hpl.jena.rdf.model.Model;

/**
 * Model container class used for testing
 * @author Gary
 *
 */
public class ModelContainerForTest implements IModelContainer {

	Model model;
	String namespace;
	int nextRef = 1;
	/**
	 * 
	 */
	public ModelContainerForTest(Model model, String namespace) {
		this.model = model;
		this.namespace = namespace;
	}

	/* (non-Javadoc)
	 * @see org.spdx.rdfparser.IModelContainer#getModel()
	 */
	@Override
	public Model getModel() {
		return this.model;
	}

	/* (non-Javadoc)
	 * @see org.spdx.rdfparser.IModelContainer#getDocumentNamespace()
	 */
	@Override
	public String getDocumentNamespace() {
		return this.namespace;
	}

	/* (non-Javadoc)
	 * @see org.spdx.rdfparser.IModelContainer#getNextSpdxElementRef()
	 */
	@Override
	public String getNextSpdxElementRef() {
		return "SpdxRef-"+String.valueOf(this.nextRef++);
	}

}
