const base = {
    get() {
                return {
            url : "http://localhost:8080/ssms159u/",
            name: "ssms159u",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssms159u/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "培训机构客户管理系统小程序"
        } 
    }
}
export default base
