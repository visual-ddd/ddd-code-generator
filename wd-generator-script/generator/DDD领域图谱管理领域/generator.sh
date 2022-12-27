# shellcheck disable=SC2164
cd ../../../wd-generator-core
mvn install
# shellcheck disable=SC2103
cd -
cd ../../
mvn clean package --offline -DskipTests=true

java -jar target/wd-generator-script.jar \
--chartXmlPath generator/DDD领域图谱管理领域/Organization.drawio \
--projectName wd-generator-web-test \
--projectAuthor ZhuXueLiang \
--projectGroup com.wd.paas.generator.web.test \
--domainName Team \
--domainDesc 团队领域 \
--domainAuthor "GaoZhiYi, ZhuXueLiang" \
--outputPath target