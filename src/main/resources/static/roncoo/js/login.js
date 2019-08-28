 function userLogin(){
            $.ajax({
                url:"../user/userLogin",
                type:"post",
                data:$("#userForm").serialize(),
                dataType:"json",
                success:function(data){
                    if(data.code==0){
                        bootbox.confirm({
                            title:"  ",
                            size: "small",
                            message: data.msg,
                            callback: function(result){
                                if(result){
                                   location.href="../page/toMain";
                                }
                            }
                        });

                    }else{
                        bootbox.alert({
                            title:"  ",
                            size:"small",
                            message:data.msg
                        });
                    }
                }
            })
        }