
require 'rubygems'
require 'newgem'

require 'rubygems'
require 'rubigen'
puts "test"

puts `pwd`



require 'rubigen/scripts/generate'

require "pp"
RubiGen::Base.use_application_sources! :rubygems
RubiGen::Base.prepend_sources(*[ 
  RubiGen::PathSource.new(:app, File.join(File.dirname(__FILE__), "..", "app_generators")),
  RubiGen::PathSource.new(:app, File.join(File.dirname(__FILE__), "..", "newgem_generators")),
  RubiGen::PathSource.new(:app, File.join(File.dirname(__FILE__), "..", "newgem_theme_generators")),
  RubiGen::PathSource.new(:app, File.join(File.dirname(__FILE__), "..", "rubygems_generators"))
])

  RubiGen::Scripts::Generate.new.run([projectName], :generator => 'newgem_simple')
