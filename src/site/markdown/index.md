#### [Code Completion][features]

[![Code Completion](images/carousel-components.jpg)][reflow-misc]

Chefclipse integrates eclipse code completion templates with the ruby editor.


#### [Inline Documentation][reflow-tools]

[![Reflow Velocity tools](images/carousel-tools.png)][reflow-tools]

Documentation from the opscode chef wiki and rubydoc available in the Editor over and RubyDoc context.

[reflow-layouts]: skin/layouts.html
[reflow-misc]: skin/misc.html
[reflow-tools]: reflow-velocity-tools/
[features]: features.html

---


## Get it now (Don't! I am still testing the installer, it is buggy!!!)

To take part in the private beta test of chefclipse, [install the beta testing packages][installation]:

If you are on a *nix platform, and already have a recent java and curl installed, then you can run the following;

```bash

curl -# -L http://limepepper.github.io/chefclipse/install | bash	

```

The contents of the installer script can be previewed here;

https://github.com/limepepper/chefclipse/blob/gh-pages/install

There is a fairly basic windows [installer exe][install-win32] here

[Full usage instructions &raquo;][chefclipse-usage]

[chefclipse-usage]: installation.html
[install-win32]: https://dl.dropboxusercontent.com/u/4171924/Chefclipse-setup.exe
[install-jar]: https://dl.dropboxusercontent.com/u/4171924/Chefclipse-setup.exe


## Configure

Chefclipse is currently a standalone RCP application: but you can add other plugins using the standard eclipse p2 update site scheme.

-   **Code Completion** - based on templates
-   **Chef-server integration** - use opsocde hsoted chef or open source editor of chef-server
-   **Code highlight** - syntax colouring for code snippets
-   **Changes preview** - compare chances before uploading to remote chef-server
-   ... [and more][reflow-config]

Check out the [documentation][chefclipse-wiki] for all the features.

[reflow-config]: skin/config.html
[chefclipse-wiki]: https://github.com/limepepper/chefclipse/wiki


---


### About

Chefclipse is an IDE based on the [eclipse e4 RCP platform][eclipse-e4]. This maven generated site uses the excellent [Reflow skin][reflow-github].

We are working towards an [open source][reflow-github] release under [Apache license][apache-license] of the chefclipse API and platform plugins.

If this project is something that you would like to support then we would be happy to [suggest a small donation to something worthwhile][donate].

[donate]: http://www.amnesty.org.uk/
[mvn-site]: http://maven.apache.org/guides/mini/guide-site.html
[eclipse-e4]: http://vimeo.com/59644991
[apache-license]: http://www.apache.org/licenses/LICENSE-2.0
[contribute]: contribute.html
[features]: features.html
[reflow-github]: http://github.com/andriusvelykis/reflow-maven-skin/
