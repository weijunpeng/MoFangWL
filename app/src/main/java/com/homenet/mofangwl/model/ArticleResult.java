package com.homenet.mofangwl.model;

/**
 * Created by weijunpeng on 2018/5/22.
 */

public class ArticleResult<T> {

    /**
     * status : OK
     * msg : 获取成功！
     * data : {"list":[{"id":1,"name":"飞鱼与海鸟","author":"渔.舟.唱.晚","category":"经典美文","time":"2016-12-04 14:21:56","point":1131,"summary":"或许，它们属于同一种蓝，海面与天空。因为它们一起生长一个故事：海天相接！于是，深邃的蓝便和浅淡的蓝得到了融合。它们彼此接近着，仿佛情侣，着装共同的蓝色。海面上除了涌动的澎湃波浪，因为有海风，想要飞翔的还有一种鱼，它们想把飞翔的轨迹白描给天蓝，带着这样...","content":"或许，它们属于同一种蓝，海面与天空。\n因为它们一起生长一个故事：海天相接！\n于是，深邃的蓝便和浅淡的蓝得到了融合。它们彼此接近着，仿佛情侣，着装共同的蓝色。\n海面上除了涌动的澎湃波浪，因为有海风，想要飞翔的还有一种鱼，它们想把飞翔的轨迹白描给天蓝，带着这样的遐想，它们梦想着，也在践行着，执着在它们的身体内部亢奋着，就连血液也一并澎湃着，连同它们坚挺的背鳍还有那些美丽的鳞片。或许，因为有了这样的向往，它们一直都在书写着它们所钟情的故事，\n带着一颗原创的心灵，努力跳跃着一种飞翔的姿势。\n天空中除了漂浮的洁白云朵，因为天和海并不是所有的地方都可以默契的诠释一种衔接，于是，海鸟便有了巨大的联想空间，喜欢奔赴海，就像历史需要它们重新丰满鸿篇巨制一样。在距离海面最近的地方，它们喜欢看到涡动的海面上它们灵动的身影，就连眼睛都闪烁着波澜的光芒。或许，穿过海面，它们就可以把自己的灵魂升华在海底，珊瑚一样美丽的梦，绚丽了它们的羽毛还有它们的声音。\n大海和天空分别被飞鱼和海鸟熟悉着，它们没有选择千百年来属于各自家族的固守，它们一直都在平添一种新奇的向往，在执着与尝试之中水乳交融着。\n或许，它们并未想过创造一种传奇，只是，它们内心总是有一个声音导引着它们心灵的方向，或许，一直都天方夜谭着，但是，属于生命的澎湃不息才是价值所在。\n我们眼中同样的蓝或许并不是真正的同样，只是我们一直都在同样的喜欢着，所以，我们不是飞鱼，也不是海鸟。\n或许，这并不是悲剧，因为我们觉得这样安静未尝不美丽。\n我们也曾望着海面和天空，嘲笑过海鸟与飞鱼的心情，没有人会认为这有多么的愚蠢，因为我们在用我们所熟悉的思维思考着，表情着。\n这，是我们的理所应当。\n我们一如既往的爱着这个世界，也只爱着我们生活的海洋或天空。\n只是，有一天，我们迎着海风，看到依然还在故事的飞鱼和海鸟，用一种前所未有的视线看到它们构思的轨迹，我们会突然庄重起来\u2026\u2026"}]}
     */

    private String status;
    private String msg;
    private T data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
