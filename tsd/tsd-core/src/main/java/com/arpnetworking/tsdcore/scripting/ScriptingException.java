/**
 * Copyright 2014 Groupon.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arpnetworking.tsdcore.scripting;

/**
 * Top-level exception thrown by classes in the scripting package.
 *
 * @author Ville Koskela (vkoskela at groupon dot com)
 */
public class ScriptingException extends Exception {

    /**
     * Public constructor.
     *
     * @param message Description of the exceptional condition.
     * @param cause The causing <code>Throwable</code> instance.
     */
    public ScriptingException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Public constructor.
     *
     * @param message Description of the exceptional condition.
     */
    public ScriptingException(final String message) {
        super(message);
    }

    private static final long serialVersionUID = 1L;
}