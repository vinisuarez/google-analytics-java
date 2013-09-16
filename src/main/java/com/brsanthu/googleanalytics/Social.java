/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.brsanthu.googleanalytics;

import static com.brsanthu.googleanalytics.Parameter.SOCIAL_ACTION;
import static com.brsanthu.googleanalytics.Parameter.SOCIAL_ACTION_TARGET;
import static com.brsanthu.googleanalytics.Parameter.SOCIAL_NETWORK;

public class Social extends AbstractRequest<Social> {
	public Social() {
		super("social");
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		<strong>Required for social hit type.</strong>
	 * 	</p>
	 * 	<p>Specifies the social network, for example Facebook or Google Plus.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>sn</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>50 Bytes
	 * 				</td>
	 * 				<td>social</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>facebook</code><br>
	 * 		Example usage: <code>sn=facebook</code>
	 * 	</div>
	 * </div>
	 */
	public Social socialNetwork(String value) {
		setString(SOCIAL_NETWORK, value);
	   	return this;
	}
	public String socialNetwork() {
		return getString(SOCIAL_NETWORK);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		<strong>Required for social hit type.</strong>
	 * 	</p>
	 * 	<p>Specifies the social interaction action. For example on Google Plus when a user clicks the +1 button, the social action is 'plus'.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>sa</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>50 Bytes
	 * 				</td>
	 * 				<td>social</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>like</code><br>
	 * 		Example usage: <code>sa=like</code>
	 * 	</div>
	 * </div>
	 */
	public Social socialAction(String value) {
		setString(SOCIAL_ACTION, value);
	   	return this;
	}
	public String socialAction() {
		return getString(SOCIAL_ACTION);
	}

	/**
	 * <div class="ind">
	 * 	<p>
	 * 		<strong>Required for social hit type.</strong>
	 * 	</p>
	 * 	<p>Specifies the target of a social interaction. This value is typically a URL but can be any text.</p>
	 * 	<table>
	 * 		<tbody>
	 * 			<tr>
	 * 				<th>Parameter</th>
	 * 				<th>Value Type</th>
	 * 				<th>Default Value</th>
	 * 				<th>Max Length</th>
	 * 				<th>Supported Hit Types</th>
	 * 			</tr>
	 * 			<tr>
	 * 				<td><code>st</code></td>
	 * 				<td>text</td>
	 * 				<td><span class="none">None</span>
	 * 				</td>
	 * 				<td>2048 Bytes
	 * 				</td>
	 * 				<td>social</td>
	 * 			</tr>
	 * 		</tbody>
	 * 	</table>
	 * 	<div>
	 * 		Example value: <code>http://foo.com</code><br>
	 * 		Example usage: <code>st=http%3A%2F%2Ffoo.com</code>
	 * 	</div>
	 * </div>
	 */
	public Social socialActionTarget(String value) {
		setString(SOCIAL_ACTION_TARGET, value);
	   	return this;
	}
	public String socialActionTarget() {
		return getString(SOCIAL_ACTION_TARGET);
	}
}
