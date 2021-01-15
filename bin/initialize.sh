#/bin/sh
docker run --rm -e POSTGRES_PASSWORD=custompw -e POSTGRES_DB=dev -p 5432:5432 -v $HOME/docker/volumes/postgres:/var/lib/postgresql -d postgres
sleep 3
export PGPASSWORD=custompw
psql -U postgres -d dev -h localhost -f src/main/resources/schema.sql
psql -U postgres -d dev -h localhost -f src/main/resources/data.sql