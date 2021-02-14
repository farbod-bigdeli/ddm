
COMMON = src/common
CLIENT = src/client
SERVER = src/server

client:
	@mvn -pl $(COMMON),$(CLIENT) clean compile jar:jar

server:
	@mvn -pl $(COMMON),$(SERVER) clean compile jar:jar

common:
	@mvn -pl $(COMMON) clean compile

test_common:
	@mvn -pl $(COMMON) clean compile test

clean_all:
	@mvn -pl $(COMMON),$(CLIENT),$(SERVER) clean

run_server: server
	@mvn -pl $(SERVER) exec:java

run_client: client
	@mvn -pl $(CLIENT) exec:java