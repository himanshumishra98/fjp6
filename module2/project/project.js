let fs=require("fs")

let path=require("path")

let folderpath=process.argv[2];
console.log(folderpath);

let folderexist=fs.existsSync(folderpath);

//console.log(folderpath)

/*
if(folderpath)
{
     console.log("path is correct")
}


let exten

else
{
    console.log("path  is  incorrect")
}



*/
let extentions={
    Audio:[".mp3"],
    Video:["mp4","mkv"],
    Image:[".jpeg","jpg"],
    Document:[".pdf","zip"]
}

if(folderexist)
{
    let files=fs.readdirSync(folderpath);
    for(let i=0;i<files.length;i++)
    {
    let ext=path.extname(files[i]);
    console.log(ext)

    let  nameoffolder=givefoldername(ext);
    //console.log("ext" ,ext,"foldename",nameoffolder)
    let pathoffolder=path.join(folderpath,nameoffolder);
    let exist=fs.existsSync(pathoffolder)
    if(exist)
    {
        movefile(folderpath,pathoffolder,files[i]);
    }
    else 
    {
        fs.mkdirSync(pathoffolder);
        movefile(folderpath,pathoffolder,files[i]);
    }
  }
}
else
{
    console.log("enter a valid path");
}



function givefoldername(ext)
{
       for( let  key in extentions)
       {
            let extArr=extentions[key];
            for( i=0;i<extArr.length;i++)
            {
                if(extArr[i]==ext)
                {
                    return key;
                }
            }
        
       }
       return 'others'; 
}


function movefile(folderpath,pathoffolder,filename)
{
let sourcepath=path.join(folderpath,filename);
let destinationpath=path.join(pathoffolder,filename);
fs.copyFileSync(sourcepath,destinationpath);
fs.unlinkSync(sourcepath);
}
