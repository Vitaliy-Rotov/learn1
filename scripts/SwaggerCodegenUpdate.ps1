# Paths
$MoveDataTo = '..\src\main\java\com\simbirsoft\api\codegen'

# Get latest stable version
# $latestStableVersion = (Invoke-Expression "&git ls-remote --tags https://github.com/swagger-api/swagger-codegen.git ")[-1] -replace '.*refs\/tags\/v'
# С версии 3.0 убраны генераторы для .Net
$latestStableVersion = "2.4.4"

"Current latest version of SwaggerCodegen is v$latestStableVersion"

# Download latest stable version of SwaggerCodegen
wget "http://central.maven.org/maven2/io/swagger/swagger-codegen-cli/$latestStableVersion/swagger-codegen-cli-$latestStableVersion.jar" -OutFile "swagger-codegen-cli.jar"

# Start generating code (Models and APIs)
Invoke-Expression "java -jar swagger-codegen-cli.jar generate -i http://petstore.swagger.io/v2/swagger.json -l java -o samples/client/petstore/java -c CodegenConfig.json"

# Remove generated sources and codegen
Remove-Item '.\swagger-codegen-cli.jar'