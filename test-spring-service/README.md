docker pull nginx
docker run -d -p 80:80 nginx
docker buildx build .

create postgres DB in my docker:
docker run -p 5556:5432 --name test-spring-postgres -e POSTGRES_PASSWORD=postgres -d postgres
458c7569a25d6d0f24e0b53d04ecdbbc869a4a9b348915c9872dc04ac87d922c (this is dockerId)