/*
 * Copyright 2015 the original author or authors.
 *
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
 */

package org.springframework.cloud.dataflow.rest.client;

import org.springframework.cloud.dataflow.rest.resource.CompletionProposalsResource;

/**
 * Interface defining operations related to providing code completion in the DSL.
 *
 * @author Eric Bottard
 */
public interface CompletionOperations {

	/**
	 * Return the list of streamCompletions that are compatible with the given DSL prefix.
	 *
	 * @param prefix the provided prefix value from DSL
	 * @param levelOfDetail integer value that specifies the level of detail user wants in
	 * stream completions
	 * @return the stream completion proposals for the given DSL prefix
	 */
	CompletionProposalsResource streamCompletions(String prefix, int levelOfDetail);

	/**
	 * Return the list of taskCompletions that are compatible with the given DSL prefix.
	 *
	 * @param prefix the provided prefix value from DSL
	 * @param levelOfDetail integer value that specifies the level of detail user wants in
	 * task completions
	 * @return the task completion proposals for the given DSL prefix
	 */
	CompletionProposalsResource taskCompletions(String prefix, int levelOfDetail);
}
