current_dir = File.dirname(__FILE__)
log_level                :info
log_location             STDOUT
node_name                "chefclipse-validator"
client_key               "/home/tomhodder/.chef/chefclipse-validator.pem"
validation_client_name   "chefclipse-validator"
validation_key           "/home/tomhodder/.chef/chefclipse-validator.pem"
chef_server_url          "https://api.opscode.com/organizations/chefclipse"
cache_type               'BasicFile'
cache_options( :path => "#{ENV['HOME']}/.chef/checksums" )
cookbook_path            ["/home/tomhodder/chef-repo/cookbooks"]
