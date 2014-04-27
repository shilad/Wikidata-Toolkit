package org.wikidata.wdtk.rdf;

/*
 * #%L
 * Wikidata Toolkit RDF
 * %%
 * Copyright (C) 2014 Wikidata Toolkit Developers
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
import java.util.HashSet;
import java.util.Set;

import org.wikidata.wdtk.datamodel.interfaces.NoValueSnak;
import org.wikidata.wdtk.datamodel.interfaces.SnakVisitor;
import org.wikidata.wdtk.datamodel.interfaces.SomeValueSnak;
import org.wikidata.wdtk.datamodel.interfaces.ValueSnak;

public class SnakRdfConverter implements
		SnakVisitor<Set<org.openrdf.model.Statement>> {

	final ValueRdfConverter valueRdfConverter;

	public SnakRdfConverter(ValueRdfConverter valueRdfConverter) {
		this.valueRdfConverter = valueRdfConverter;
	}

	@Override
	public Set<org.openrdf.model.Statement> visit(ValueSnak snak) {
		Set<org.openrdf.model.Statement> result = new HashSet<org.openrdf.model.Statement>(); // empty
																								// TODO:
																								// fill
		return result;
	}

	@Override
	public Set<org.openrdf.model.Statement> visit(SomeValueSnak snak) {
		Set<org.openrdf.model.Statement> result = new HashSet<org.openrdf.model.Statement>(); // empty
																								// TODO:
																								// fill
		return result;
	}

	@Override
	public Set<org.openrdf.model.Statement> visit(NoValueSnak snak) {
		Set<org.openrdf.model.Statement> result = new HashSet<org.openrdf.model.Statement>(); // empty
																								// TODO:
																								// fill
		return result;
	}

}
