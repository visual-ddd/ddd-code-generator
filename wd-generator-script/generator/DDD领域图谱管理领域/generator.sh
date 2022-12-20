# shellcheck disable=SC2164
cd ../../../wd-generator-core
mvn install
# shellcheck disable=SC2103
cd -
cd ../../
mvn clean package --offline -DskipTests=true

java -jar target/wd-generator-script-1.0-SNAPSHOT-jar-with-dependencies.jar \
--chartXmlPath generator/DDD领域图谱管理领域/代码生成器-管理领域.drawio \
--projectName wd-generator-web-test \
--projectAuthor ZhuXueLiang \
--projectGroup com.wd.paas.generator.web.test \
--domainName codegen \
--description 代码生成领域 \
--domainAuthor "GaoZhiYi, ZhuXueLiang" \
--outputPath target \
--generateWay OVERALL