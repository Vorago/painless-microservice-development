Vagrant.configure('2') do |config|
  config.vm.box = 'ubuntu/xenial64'
  config.vm.synced_folder '.', '/vagrant'
  config.vm.provision 'shell', path: 'bootstrap.sh'
  config.vm.network 'forwarded_port', guest: 80, host: 8080
  config.vm.network 'forwarded_port', guest: 5432, host: 5432
  config.vm.provision :shell, path: 'ansible-provision.sh'
end