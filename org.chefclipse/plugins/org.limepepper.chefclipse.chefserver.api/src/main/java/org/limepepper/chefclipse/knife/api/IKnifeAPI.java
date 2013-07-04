package org.limepepper.chefclipse.knife.api;

import java.io.File;

import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Metadata;

/**
 *
 * this is going to be a wrapper to allow various knife calls and will be
 * immediately implemented by wrapping knife in syscalls, but the intention is
 * to
 * migrate to dedicated functionality where it would benefit with integrations
 * with ACM and once most of that is mapped, we can put the knife back in the
 * drawer
 *
 * this might end up being a wrapper for Rake
 *
 * @author tomhodder
 *
 */
public interface IKnifeAPI {

    void createCookbook(String name);

    void generateMetadata(String name);

    void generateAllMetadata();

    Metadata getMetadata(String name);

    Metadata getMetadata(CookbookVersion cookbook);
    
    Metadata getCookbookMetadata(File file);

}
