# setsecurity

## Build JAR

```bash
./gradlew bootJar
```

## Run with Docker

```bash
# Copy a docker environment file (docker-compose.yml)
# Fix .env file which you want
cp .env.default .env

# Excute Containers with docker-compose.yml
docker-compose up
```

## Usage
```bash
- PcsList : GET <http://localhost:8080/pcs>
- PcList : GET <http://localhost:8080/pc/{no}
- PcStatusApply : POST <http://localhost:8080/pcs>
  JSON {"ip": "127.0.0.1", "time": "2020/05/11 15:00",
  "status": "CODE_1:True, CODE_2:True, CODE_3:True, CODE_4:True,
  CODE_5:True, CODE_6:True, CODE_7:True, CODE_8:Ture"}
```
  
### MacOS Security Setting Script : https://github.com/h232ch/macsecurity <br><br>
