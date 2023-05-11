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

package ua.mibal.minervaTest.model;

import java.util.List;

/**
 * @author Mykhailo Balakhon
 * @link t.me/mibal_ua
 */
public class Library {

    private final List<Book> books;

    private final List<Client> clients;

    private final List<Operation> operations;

    public Library(final List<Book> books, final List<Client> clients, final List<Operation> operations) {
        this.books = books;
        this.clients = clients;
        this.operations = operations;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public List<Book> findBooks(final String input) {
        // TODO
        return null;
    }

    public List<Client> findClients(final String input) {
        // TODO
        return null;
    }
}
