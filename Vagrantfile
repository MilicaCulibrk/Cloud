Vagrant.configure("2") do |config|
  config.vm.box = "hashicorp/bionic64"
  config.vm.network "forwarded_port", guest: 8081, host: 8081
  config.vm.network "forwarded_port", guest: 82, host: 82
  config.vm.provision "file", source: "WebApp", destination: "WebApp"
  config.vm.provision "file", source: "NGINX", destination: "NGINX"
  config.vm.provision "file", source: "docker-compose.yml", destination: "docker-compose.yml"
  config.vm.provision :shell, path: "script.sh"
end
