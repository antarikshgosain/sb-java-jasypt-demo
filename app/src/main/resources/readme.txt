//ran this command form the terminal, value to encrypt=test
//add VM options to the Main file of Springboot: -Djasypt.encryptor.password=password
//-Djasypt.encryptor.password: password for the encryption
//-Djasypt.plugin.value: value to encrypt (like the API key)

mvn jasypt:encrypt-value "-Djasypt.encryptor.password=password" "-Djasypt.plugin.value=test"