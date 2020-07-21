# setsecurity

## Build JAR

```bash
./gradlew bootJar
```

## Run with Docker

```bash
# Docker용 환경 설정 파일을 복사합니다. (docker-compose.yml)
# .env 파일은 필요에 따라 수정해서 사용하시면 됩니다.
cp .env.default .env

# 컨테이너를 모두 실행합니다.
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
  
## MacOS Security Setting Script : https://github.com/h232ch/macsecurity <br><br>
