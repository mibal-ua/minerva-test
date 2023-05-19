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

package ua.mibal.minervaTest.component;


import ua.mibal.minervaTest.Application;
import ua.mibal.minervaTest.component.console.ConsoleDataPrinter;
import ua.mibal.minervaTest.component.console.ConsoleUserInputReader;
import ua.mibal.minervaTest.component.request.RequestConfigurator;
import ua.mibal.minervaTest.component.request.RequestProcessor;

/**
 * @author Mykhailo Balakhon
 * @link t.me/mibal_ua
 */
public class ApplicationConfigurator {

    private final DataPrinter dataPrinter = new ConsoleDataPrinter();

    private final UserInputReader inputReader = new ConsoleUserInputReader();

    private final RequestConfigurator requestConfigurator =
        new RequestConfigurator(dataPrinter, inputReader);

    private final RequestProcessor requestProcessor;

    private final DataOperator dataOperator;

    public ApplicationConfigurator(final String path) {
        dataOperator = new JavaSerializationDataOperator(path);
        requestProcessor = new RequestProcessor(dataPrinter, inputReader, dataOperator);
    }

    public Application configure() {
        return new Application(
            dataOperator,
            requestConfigurator,
            requestProcessor
        );
    }
}
