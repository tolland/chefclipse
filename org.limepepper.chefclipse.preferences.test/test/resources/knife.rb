current_dir = File.dirname(__FILE__)
log_level                :info
log_location             STDOUT
node_name                "ssampaoli"
client_key               "#{current_dir}/sampaoli.pem"
validation_client_name   "some-validator"
validation_key           "#{current_dir}/some-validator.pem"
chef_server_url          "https://api.opscode.com/organizations/someorganization"
cache_type               'BasicFile'
cache_options( :path => "#{ENV['HOME']}/.chef/checksums" )
cookbook_path            ["#{current_dir}/../cookbooks"]
