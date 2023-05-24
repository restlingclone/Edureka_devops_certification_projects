node default{
  class{'dock':}
}

class dock{
  package{'docker':
     ensure => 'present',
  }
  service{'docker':
     ensure => 'running',
     enable => true
  }
}
