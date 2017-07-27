# spark-project-template

Environment
-
1. IntelliJ maven project
2. scala 2.11.11
3. spark 2.2.0
4. open-korean-text 2.1.0

(2017.07.27) spark library는 2.10, 2.11까지 지원하고 있으며, 2.12는 현재 지원하고 있지 않으므로, open-korean-text의 빌드를 scala 2.11.x 버젼으로 jar 패키징을 새로할 것. 또는 module로 등록 후, pom.xml을 상위 프로젝트의 scala.version을 상속토록하여 통일시켜줄 것.
