function DrawImg(pic, boxWidth, boxHeight) {
    var imgWidth = $(pic).width();

　　 var imgHeight = $(pic).height();

　　　 //比较imgBox的长宽比与img的长宽比大小

　　　 if ((boxWidth / boxHeight) >= (imgWidth / imgHeight))

        　　　 {

    　　　　　　　 //重新设置img的width和height

    　　　　　　　 $(pic).width((boxHeight * imgWidth) / imgHeight);

　　　　　　　 $(pic).height(boxHeight);

　　　　　　　 //让图片居中显示

    　　　　　　　 var margin = (boxWidth - $(pic).width()) / 2;

　　　　　　　 //$(pic).css("margin-left",margin);

    　　　
    }

　　　 else

　　　 {

    　　　　　　　 //重新设置img的width和height

    　　　　　　　 $(pic).width(boxWidth);

　　　　　　　 $(pic).height((boxWidth * imgHeight) / imgWidth);

　　　　　　　 //让图片居中显示

    　　　　　　　 var margin = (boxHeight - $(pic).height()) / 2;

　　　　　     $(pic).css("margin-top", margin);

　　　
    }

}