/*
 * Copyright (c) 2023. http://t.me/mibal_ua
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

package ua.mibal.minervaTest.model.window;

/**
 * @author Mykhailo Balakhon
 * @link t.me/mibal_ua
 */
public enum DataType {

    BOOK,

    CLIENT,

    HISTORY,

    NULL;

    public static boolean contains(final String value) {
        for (DataType type : values()) {
            if (type.name().equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
}
