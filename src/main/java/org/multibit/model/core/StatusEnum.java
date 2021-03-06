/* 
 * SparkBit
 *
 * Copyright 2011-2014 multibit.org
 * Copyright 2014 Coin Sciences Ltd
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.multibit.model.core;

public enum StatusEnum {
    ONLINE("multiBitFrame.onlineText"),
    CONNECTING("multiBitFrame.offlineText"),
    ERROR("multiBitFrame.errorText");
    
    private String localisationKey;
    
    private StatusEnum(String localisationKey) {
        this.localisationKey = localisationKey;
      }

    public String getLocalisationKey() {
        return localisationKey;
    }         
}