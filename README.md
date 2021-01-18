# 修改.gitignore文件，重新定义过滤规则

场景：由于未添加.gitignore文件，导致一些非必要文件长传到了git仓库，现需添加.gitinore文件，过滤掉git仓库上的非必要文件。

+ 首先为避免冲突需要先同步下远程仓库

  `git pull`

+ 在本地项目目录下删除缓存

  `git rm -r --cached .`

+ 在项目的根目录下面修改或新建.gitignore文件

  `git add .`

+ 再次commit添加.igtinore文件

  `git commit -m "add ignore"`

+ 最后提交到远程仓库即可

  `git push`