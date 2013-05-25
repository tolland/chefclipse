/*******************************************************************************
 * Copyright (c) 2011 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package org.limepepper.chefclipse.emfjson.chefserver;

import static org.limepepper.chefclipse.emfjson.chefserver.internal.ChefServerClient.getGetConnection;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;
import org.eclipselabs.emfjson.internal.JSONLoad;
import org.eclipselabs.emfjson.internal.JsInputStream;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.emfjson.chefserver.internal.ChefRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChefServerURIHandler extends URIHandlerImpl {

    static Logger logger = LoggerFactory.getLogger(ChefServerURIHandler.class);

    @Override
    public boolean canHandle(URI uri) {
        // return isChefServerApiService(uri);
        return uri.toString().contains("http")
                || uri.toString().startsWith("https://");
    }

    @Override
    public InputStream createInputStream(final URI uri, final Map<?, ?> options)
            throws IOException {

        logger.debug("Creating JsInputStream to process uri: {}", uri);

/*
 * if (checkDataBase(new ChefRequest(uri, null)) == 0) {
 * throw new IllegalArgumentException("DataBase does not exist");
 * }
 */
        JsInputStream is = new JsInputStream(uri, options) {

            @Override
            public void loadResource(Resource resource) throws IOException {

                if (options != null) {
                    final KnifeConfig knifeConfig = (KnifeConfig) options
                            .get("knifeConfig");
                    if (knifeConfig != null) {
                        final HttpURLConnection connection = getGetConnection(new ChefRequest(
                                uri, knifeConfig));
                        final InputStream inStream = connection
                                .getInputStream();


                        System.out.println("stream to string2: ");

                        final JSONLoad loader = new JSONLoad(inStream, options);
                        loader.fillResource(resource);
                    }
                }
            }
        };

        if (options != null) {
            final KnifeConfig knifeConfig = (KnifeConfig) options
                    .get("knifeConfig");
            if (knifeConfig != null) {
                final HttpURLConnection connection = getGetConnection(new ChefRequest(
                        uri, knifeConfig));
                BufferedInputStream bis = new BufferedInputStream(
                        connection.getInputStream());
                bis.mark(Integer.MAX_VALUE);
                System.out.println("stream to string: "+ convertStreamToString(bis));

                bis.reset();
                return bis;
            }
        }
        return null;
    }

    public static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is, "UTF-8")
                .useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

/*
 * @Override
 * public OutputStream createOutputStream(final URI uri, Map<?, ?> options)
 * throws IOException {
 * if (checkDataBase(uri) == 0) {
 * createDataBase(uri);
 * }
 *
 * return new JsOutputStream(options) {
 * public void close() throws IOException {
 * URI documentURI = CouchDB.createOrUpdateDocument(uri, writer, currentRoot);
 * if (documentURI != uri) {
 * resource.setURI(documentURI);
 * }
 * }
 * };
 * }
 */

    private void createDataBase(URI uri) {
    }

/*
 * @Override
 * public void delete(URI uri, Map<?, ?> options) throws IOException {
 * CouchDB.delete(uri);
 * }
 */

}
