mvn clean install -Dmaven.test.skip=true
# shellcheck disable=SC2164
cd wd-generator-web
mvn validate docker:build docker:push docker:remove
cd ../