# -*- mode: ruby -*-
# vi: set ft=ruby :

VAGRANTFILE_API_VERSION = "2"
Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.synced_folder ".", "/vagrant"
  config.vm.provision "shell", path: "bootstrap.sh"
  config.vm.network "forwarded_port", guest: 80, host: 8080
  config.vm.provision :shell, inline: 'ansible-playbook /vagrant/ansible/setup.yml -i /vagrant/ansible/inventory/hosts -c local'
end
