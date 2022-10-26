call mvn clean install -Dmaven.test.skip=true
cd wd-generator-web
call mvn validate docker:build docker:push docker:remove
cd ../