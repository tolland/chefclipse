Name:           chefclipse
Version:        1.0
Release:        1%{?dist}
Summary:        Chefclipse package

License:        GPL
URL:            http://www.chefclipse.org
Source0:        chefclipse-%{version}

BuildRequires:  chrpath, desktop-file-utils

%description


%prep
%setup -q
chrpath --delete $RPM_BUILD_ROOT/libcairo-swt.so

%build
%configure
make %{?_smp_mflags}


%install
set(QA_CHECK_RPATHS false)
rm -rf $RPM_BUILD_ROOT
%make_install
set(QA_CHECK_RPATHS false)

%files
%doc



%changelog
