# catコマンドを作ろう

ファイル・ディレクトリ操作
- ls – ディレクトリ内のファイル一覧を表示 (Files.list() など)
- cat – ファイル内容を標準出力に表示 (Files.readAllLines() 等)
- cp – ファイルをコピー (Files.copy())
- mv – ファイルを移動またはリネーム (Files.move())
- rm – ファイルを削除 (Files.delete())
- mkdir – ディレクトリを作成 (Files.createDirectory())
- rmdir – 空ディレクトリを削除 (Files.delete())
- pwd – 現在の作業ディレクトリを表示 (System.getProperty("user.dir"))
- touch – 空ファイル作成またはタイムスタンプ更新 (Files.setLastModifiedTime() or Files.createFile())
- find – ディレクトリを再帰的に探索 (Files.walkFileTree())
### ファイル内容処理
- head – ファイルの先頭数行を表示 (BufferedReader + limit)
- tail – ファイルの末尾数行を表示 (リスト保持または逆順読み)
- wc – 行数・単語数・バイト数をカウント (Files.lines(), String.split())
- grep – 指定文字列を含む行を抽出 (Pattern, Matcher)
- sort – 行をソート (Collections.sort() または Stream.sorted())
- uniq – 重複行を削除 (LinkedHashSet など)
### システム情報・管理
- date – 現在日時を表示 (LocalDateTime.now())
- whoami – 現在のユーザー名を表示 (System.getProperty("user.name"))
- echo – 引数をそのまま出力 (System.out.println())
- env – 環境変数を一覧表示 (System.getenv())

標準入力の終わり：d
