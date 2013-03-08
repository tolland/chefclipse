Name:           chefclipse
Version:        1.0
Release:        1%{?dist}
Summary:        Chefclipse package

License:        GPL
URL:            http://www.chefclipse.org
Source0:        chefclipse-%{version}

BuildRequires:  
Requires:       

%description


%prep
%setup -q


%build
%configure
make %{?_smp_mflags}


%install
rm -rf $RPM_BUILD_ROOT
%make_install


%files
%doc



%changelog
