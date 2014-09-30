AndroidEvent
============

This is a Event receiver and dispather.Use for example:

Event.addListener("eventname",new Event.EventCallBack() {

    @Override

    public void execute(Object data) {

        System.out.println(data);

    }

});

Event.dispatch("eventname",new Object());


自己用的一个事件收发器，简单实现了事件的收发和传递。支持携带数据。可以用于不同界面之间的数据传递。