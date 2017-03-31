#  UI 工程
UI部分

## 准备工作
- 安装node
- 安装yarn

## 启动
- yarn install
- yarn run start


## 目录结构

```
.
├── /build/                     # 编译输出目录
├── /docs/                      # 文档
├── /node_modules/              # 第三方依赖模块
├── /src/                       # 源代码
│   ├── /components/            # React组件
│   ├── /content/               # 静态文件(HTML,images, Jade模板, )
│   ├── /core/                  # 核心类库
│   ├── /data/                  # webapi访问接口
│   ├── /pages/                 # 开发的微信页面
│   ├── /config.js              # 全局配置文件
│   ├── /manage.jsx             # UI入口
├── /tools/                     # 辅助工具箱，主要定义编译，部署，调试环境的启动脚本
│   ├── /bundle.js              # 使用webpack打包js，css资源
│   ├── /clean.js               # 清理编译的临时目录
│   ├── /deploy.js              # 部署脚本
│   ├── /render.js              # 根据编译结果渲染模板
│   ├── /run.js                 # 定义npm run 可执行的任务列表
│   ├── /server.js              # 启动调试服务器
│   └── /webpack.config.js      # webpack 的打包配置文件
│── package.json                # 定义依赖

```
