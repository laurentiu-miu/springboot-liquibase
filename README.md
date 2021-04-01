# springboot gcp spanner liquibase integration

# 1. start a spanner emulator using docker
docker pull gcr.io/cloud-spanner-emulator/emulator
docker run -p 9010:9010 -p 9020:9020 gcr.io/cloud-spanner-emulator/emulator
gcloud config configurations create emulator
gcloud config set auth/disable_credentials true
gcloud config set project test-project
export SPANNER_EMULATOR_HOST=localhost:9010
gcloud config configurations activate emulator
gcloud spanner instances create test-instance --config=emulator-config --description="Test Instance" --nodes=1
gcloud spanner databases create testdb --instance=test-instance
# 2. build project
mvn clean install
# 3. run application
mvn spring-boot:run
