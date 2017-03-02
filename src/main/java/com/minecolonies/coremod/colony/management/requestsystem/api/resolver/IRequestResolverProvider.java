package com.minecolonies.coremod.colony.management.requestsystem.api.resolver;

import com.google.common.collect.ImmutableCollection;
import com.minecolonies.coremod.colony.management.requestsystem.api.token.IToken;

/**
 * Interface used to describe a class that provides resolvers.
 * Should be put on Buildings, Citizens etc who can resolve certain requests.
 *
 * If a provider is added to his or her colony
 */
public interface IRequestResolverProvider {

    /**
     * Unique token identifying this provider inside the request management system-
     * @param <T>
     * @return
     */
    <T extends IToken> T getToken();

    /**
     * Method to get the resolvers that this provider provides.
     * @return
     */
    ImmutableCollection<IRequestResolver> getResolvers();
}
