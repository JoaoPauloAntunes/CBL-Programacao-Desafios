# Preparando o ambiente

> :warning: **você precisa ter permissão de adminstrador para fazer isso!

0. Veja este [vídeo](https://www.youtube.com/watch?v=QeVl8fXteI0).
1. Instale o [VSCode](https://code.visualstudio.com/download).
2. No VSCode, instale as seguintes extensões:
- [Code Runner](https://marketplace.visualstudio.com/items?itemName=formulahendry.code-runner)
- [Kotlin Language](https://marketplace.visualstudio.com/items?itemName=mathiasfrohlich.Kotlin)
3. Baixe o compilador do Kotlin na seção "Assets": [kotlin-compiler-x.x.x-XX.zip](https://github.com/JetBrains/kotlin/releases)
4. Extraia o arquivo .zip baixado e mova a pasta `kotlinc` para o diretório `C:\Program Files`. 
5. Clone este repositório para a sua máquina e abra ele com o VSCode ([como clonar um repositório?](https://docs.github.com/pt/repositories/creating-and-managing-repositories/cloning-a-repository)).
6. No VSCode, abra o arquivo `scripts/hello.kt` e clique no botão de **rodar código** no canto superior direito da tela. Um arquivo `hello.jar` é gerado e executado, a sua saída é exibida na aba `OUTPUT` do terminal integrado do VSCode.

# Dicas

- [Como configurar o Code Runner para rodar na aba `TERMINAL` do terminal integrado](https://py-vscode.readthedocs.io/en/latest/files/code-runner.html)
- Como rodar um arquivo ".jar":
`java -jar scripts/hello.jar`
