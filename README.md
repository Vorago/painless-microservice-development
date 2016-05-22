# Synopsis

This is a PoC for my "Painless microservice development" talk

https://speakerdeck.com/vorago/painless-microservice-development

## Quickstart

~~~
cd painless-microservice-development
vagrant up
~~~

## Run services

~~~
ansible-playbook services-stop.yml -i inventory/local
~~~

## Stop services

~~~
ansible-playbook services-start.yml -i inventory/local
~~~
