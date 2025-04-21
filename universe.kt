/*My first OOP program :)
Added the explanations too for better understanding.

ＨＯＷ        ＩＴ        ＷＯＲＫＳ：
ＪＵＳＴ        ＲＵＮ        ＴＨＥ       ＣＯＤＥ！

by Matteo, inspired by McThanos ™    */

//Title: ᴏᴏᴘ ᴜɴɪᴠᴇʀꜱᴇ 🌌 (kt)

//Creating the main class; on open Class; name: Universe.
open class Universe(var name: String, var gravity: Double, var info: String){
    
}

//Creating an inherit (child) class of the class Universe; name Planet.
class Planet(name: String, gravity: Double, info: String): Universe(name, gravity, info){
    
}


//Main function, will be runned all inside it.
fun main(args: Array <String>){
    println("𝕎𝕖𝕝𝕔𝕠𝕞𝕖 𝕥𝕠 𝕥𝕙𝕖 𝕌𝕟𝕚𝕧𝕖𝕣𝕤𝕖!\n𝒫𝓈: 𝑀𝓎 𝟣𝓈𝓉 𝒪𝒪𝒫 𝒸𝑜𝒹𝑒 :)\n")
    println("___  ___  ___\n" )
    var x = 0
    //Creating all the variables (val == immutable) of the planets (Planet class).
    val sun = Planet("ＳＵＮ", 274.0, "ᴛʜᴇ ꜱᴜɴ ʟɪᴇꜱ ᴀᴛ ᴛʜᴇ ʜᴇᴀʀᴛ ᴏꜰ ᴛʜᴇ ꜱᴏʟᴀʀ ꜱʏꜱᴛᴇᴍ, ᴡʜᴇʀᴇ ɪᴛ ɪꜱ ʙʏ ꜰᴀʀ ᴛʜᴇ ʟᴀʀɢᴇꜱᴛ ᴏʙᴊᴇᴄᴛ. ɪᴛ ʜᴏʟᴅꜱ 99.8 ᴘᴇʀᴄᴇɴᴛ ᴏꜰ ᴛʜᴇ ꜱᴏʟᴀʀ ꜱʏꜱᴛᴇᴍ'ꜱ ᴍᴀꜱꜱ ᴀɴᴅ ɪꜱ ʀᴏᴜɢʜʟʏ 109 ᴛɪᴍᴇꜱ ᴛʜᴇ ᴅɪᴀᴍᴇᴛᴇʀ ᴏꜰ ᴛʜᴇ ᴇᴀʀᴛʜ — ᴀʙᴏᴜᴛ ᴏɴᴇ ᴍɪʟʟɪᴏɴ ᴇᴀʀᴛʜꜱ ᴄᴏᴜʟᴅ ꜰɪᴛ ɪɴꜱɪᴅᴇ ᴛʜᴇ ꜱᴜɴ. ... ᴛʜᴇ ꜱᴜɴ ɪꜱ ᴏɴᴇ ᴏꜰ ᴍᴏʀᴇ ᴛʜᴀɴ 100 ʙɪʟʟɪᴏɴ ꜱᴛᴀʀꜱ ɪɴ ᴛʜᴇ ᴍɪʟᴋʏ ᴡᴀʏ")
    val earth = Planet("ＥＡＲＴＨ", 9.807, "ᴏᴜʀ ʜᴏᴍᴇ ᴘʟᴀɴᴇᴛ ᴇᴀʀᴛʜ ɪꜱ ᴀ ʀᴏᴄᴋʏ, ᴛᴇʀʀᴇꜱᴛʀɪᴀʟ ᴘʟᴀɴᴇᴛ. ɪᴛ ʜᴀꜱ ᴀ ꜱᴏʟɪᴅ ᴀɴᴅ ᴀᴄᴛɪᴠᴇ ꜱᴜʀꜰᴀᴄᴇ ᴡɪᴛʜ ᴍᴏᴜɴᴛᴀɪɴꜱ, ᴠᴀʟʟᴇʏꜱ, ᴄᴀɴʏᴏɴꜱ, ᴘʟᴀɪɴꜱ ᴀɴᴅ ꜱᴏ ᴍᴜᴄʜ ᴍᴏʀᴇ. ᴇᴀʀᴛʜ ɪꜱ ꜱᴘᴇᴄɪᴀʟ ʙᴇᴄᴀᴜꜱᴇ ɪᴛ ɪꜱ ᴀɴ ᴏᴄᴇᴀɴ ᴘʟᴀɴᴇᴛ. ᴡᴀᴛᴇʀ ᴄᴏᴠᴇʀꜱ 70 ᴘᴇʀᴄᴇɴᴛ ᴏꜰ ᴇᴀʀᴛʜ'ꜱ ꜱᴜʀꜰᴀᴄᴇ")
    val mercury = Planet("ＭＥＲＣＵＲＹ", 3.7, "ᴍᴇʀᴄᴜʀʏ ɪꜱ ᴛʜᴇ ꜱᴍᴀʟʟᴇꜱᴛ ᴘʟᴀɴᴇᴛ ɪɴ ᴏᴜʀ ꜱᴏʟᴀʀ ꜱʏꜱᴛᴇᴍ. ɪᴛ'ꜱ ᴊᴜꜱᴛ ᴀ ʟɪᴛᴛʟᴇ ʙɪɢɢᴇʀ ᴛʜᴀɴ ᴇᴀʀᴛʜ'ꜱ ᴍᴏᴏɴ. ... ᴀʟᴏɴɢ ᴡɪᴛʜ ᴠᴇɴᴜꜱ, ᴇᴀʀᴛʜ, ᴀɴᴅ ᴍᴀʀꜱ, ᴍᴇʀᴄᴜʀʏ ɪꜱ ᴏɴᴇ ᴏꜰ ᴛʜᴇ ʀᴏᴄᴋʏ ᴘʟᴀɴᴇᴛꜱ. ɪᴛ ʜᴀꜱ ᴀ ꜱᴏʟɪᴅ ꜱᴜʀꜰᴀᴄᴇ ᴛʜᴀᴛ ɪꜱ ᴄᴏᴠᴇʀᴇᴅ ᴡɪᴛʜ ᴄʀᴀᴛᴇʀꜱ. ɪᴛ ʜᴀꜱ ɴᴏ ᴀᴛᴍᴏꜱᴘʜᴇʀᴇ, ᴀɴᴅ ɪᴛ ᴅᴏᴇꜱɴ'ᴛ ʜᴀᴠᴇ ᴀɴʏ ᴍᴏᴏɴꜱ. ᴠᴇɴᴜꜱ ɪꜱ ᴛʜᴇ ꜱᴇᴄᴏɴᴅ ᴘʟᴀɴᴇᴛ ꜰʀᴏᴍ ᴛʜᴇ ꜱᴜɴ. ɪᴛ ɪꜱ ɴᴀᴍᴇᴅ ᴀꜰᴛᴇʀ ᴛʜᴇ ʀᴏᴍᴀɴ ɢᴏᴅᴅᴇꜱꜱ ᴏꜰ ʟᴏᴠᴇ ᴀɴᴅ ʙᴇᴀᴜᴛʏ.")
    val venus = Planet("ＶＥＮＵＳ", 8.87, "ᴠᴇɴᴜꜱ ɪꜱ ᴀ ᴛᴇʀʀᴇꜱᴛʀɪᴀʟ ᴘʟᴀɴᴇᴛ ᴀɴᴅ ɪꜱ ꜱᴏᴍᴇᴛɪᴍᴇꜱ ᴄᴀʟʟᴇᴅ ᴇᴀʀᴛʜ'ꜱ `ꜱɪꜱᴛᴇʀ ᴘʟᴀɴᴇᴛ` ʙᴇᴄᴀᴜꜱᴇ ᴏꜰ ᴛʜᴇɪʀ ꜱɪᴍɪʟᴀʀ ꜱɪᴢᴇ, ᴍᴀꜱꜱ, ᴘʀᴏxɪᴍɪᴛʏ ᴛᴏ ᴛʜᴇ ꜱᴜɴ, ᴀɴᴅ ʙᴜʟᴋ ᴄᴏᴍᴘᴏꜱɪᴛɪᴏɴ. ɪᴛ ɪꜱ ʀᴀᴅɪᴄᴀʟʟʏ ᴅɪꜰꜰᴇʀᴇɴᴛ ꜰʀᴏᴍ ᴇᴀʀᴛʜ ɪɴ ᴏᴛʜᴇʀ ʀᴇꜱᴘᴇᴄᴛꜱ.")
    val mars = Planet("ＭＡＲＳ", 3.711, "ᴍᴀʀꜱ ɪꜱ ᴛʜᴇ ꜰᴏᴜʀᴛʜ ᴘʟᴀɴᴇᴛ ꜰʀᴏᴍ ᴛʜᴇ ꜱᴜɴ ᴀɴᴅ ɪꜱ ᴛʜᴇ ꜱᴇᴄᴏɴᴅ ꜱᴍᴀʟʟᴇꜱᴛ ᴘʟᴀɴᴇᴛ ɪɴ ᴛʜᴇ ꜱᴏʟᴀʀ ꜱʏꜱᴛᴇᴍ. ɴᴀᴍᴇᴅ ᴀꜰᴛᴇʀ ᴛʜᴇ ʀᴏᴍᴀɴ ɢᴏᴅ ᴏꜰ ᴡᴀʀ, ᴍᴀʀꜱ ɪꜱ ᴀʟꜱᴏ ᴏꜰᴛᴇɴ ᴅᴇꜱᴄʀɪʙᴇᴅ ᴀꜱ ᴛʜᴇ “ʀᴇᴅ ᴘʟᴀɴᴇᴛ” ᴅᴜᴇ ᴛᴏ ɪᴛꜱ ʀᴇᴅᴅɪꜱʜ ᴀᴘᴘᴇᴀʀᴀɴᴄᴇ. ᴍᴀʀꜱ ɪꜱ ᴀ ᴛᴇʀʀᴇꜱᴛʀɪᴀʟ ᴘʟᴀɴᴇᴛ ᴡɪᴛʜ ᴀ ᴛʜɪɴ ᴀᴛᴍᴏꜱᴘʜᴇʀᴇ ᴄᴏᴍᴘᴏꜱᴇᴅ ᴘʀɪᴍᴀʀɪʟʏ ᴏꜰ ᴄᴀʀʙᴏɴ ᴅɪᴏxɪᴅᴇ.")
    val jupiter= Planet("ＪＵＰＩＴＥＲ",24.79 , "ᴊᴜᴘɪᴛᴇʀ ɪꜱ ᴛʜᴇ ꜰɪꜰᴛʜ ᴘʟᴀɴᴇᴛ ꜰʀᴏᴍ ᴛʜᴇ ꜱᴜɴ ᴀɴᴅ ᴛʜᴇ ʟᴀʀɢᴇꜱᴛ ɪɴ ᴛʜᴇ ꜱᴏʟᴀʀ ꜱʏꜱᴛᴇᴍ. ɪᴛ ɪꜱ ᴀ ɢᴀꜱ ɢɪᴀɴᴛ ᴡɪᴛʜ ᴀ ᴍᴀꜱꜱ ᴏɴᴇ-ᴛʜᴏᴜꜱᴀɴᴅᴛʜ ᴛʜᴀᴛ ᴏꜰ ᴛʜᴇ ꜱᴜɴ, ʙᴜᴛ ᴛᴡᴏ-ᴀɴᴅ-ᴀ-ʜᴀʟꜰ ᴛɪᴍᴇꜱ ᴛʜᴀᴛ ᴏꜰ ᴀʟʟ ᴛʜᴇ ᴏᴛʜᴇʀ ᴘʟᴀɴᴇᴛꜱ ɪɴ ᴛʜᴇ ꜱᴏʟᴀʀ ꜱʏꜱᴛᴇᴍ ᴄᴏᴍʙɪɴᴇᴅ. ... ꜱᴜʀʀᴏᴜɴᴅɪɴɢ ᴊᴜᴘɪᴛᴇʀ ɪꜱ ᴀ ꜰᴀɪɴᴛ ᴘʟᴀɴᴇᴛᴀʀʏ ʀɪɴɢ ꜱʏꜱᴛᴇᴍ ᴀɴᴅ ᴀ ᴘᴏᴡᴇʀꜰᴜʟ ᴍᴀɢɴᴇᴛᴏꜱᴘʜᴇʀᴇ.")
    val saturn = Planet("ＳＡＴＵＲＮ",10.44, "ꜱᴀᴛᴜʀɴ ɪꜱ ᴀ ɢᴀꜱ ɢɪᴀɴᴛ ᴍᴀᴅᴇ ᴜᴘ ᴍᴏꜱᴛʟʏ ᴏꜰ ʜʏᴅʀᴏɢᴇɴ ᴀɴᴅ ʜᴇʟɪᴜᴍ. ꜱᴀᴛᴜʀɴ'ꜱ ᴠᴏʟᴜᴍᴇ ɪꜱ ɢʀᴇᴀᴛᴇʀ ᴛʜᴀɴ 760 ᴇᴀʀᴛʜꜱ, ᴀɴᴅ ɪᴛ ɪꜱ ᴛʜᴇ ꜱᴇᴄᴏɴᴅ ᴍᴏꜱᴛ ᴍᴀꜱꜱɪᴠᴇ ᴘʟᴀɴᴇᴛ ɪɴ ᴛʜᴇ ꜱᴏʟᴀʀ ꜱʏꜱᴛᴇᴍ, ᴀʙᴏᴜᴛ 95 ᴛɪᴍᴇꜱ ᴇᴀʀᴛʜ'ꜱ ᴍᴀꜱꜱ. ᴛʜᴇ ʀɪɴɢᴇᴅ ᴘʟᴀɴᴇᴛ ɪꜱ ᴛʜᴇ ʟᴇᴀꜱᴛ ᴅᴇɴꜱᴇ ᴏꜰ ᴀʟʟ ᴛʜᴇ ᴘʟᴀɴᴇᴛꜱ, ᴀɴᴅ ɪꜱ ᴛʜᴇ ᴏɴʟʏ ᴏɴᴇ ʟᴇꜱꜱ ᴅᴇɴꜱᴇ ᴛʜᴀɴ ᴡᴀᴛᴇʀ")
    val uranus = Planet("ＵＲＡＮＵＳ", 8.87, "ᴜʀᴀɴᴜꜱ ɪꜱ ᴛʜᴇ ꜱᴇᴠᴇɴᴛʜ ᴘʟᴀɴᴇᴛ ꜰʀᴏᴍ ᴛʜᴇ ꜱᴜɴ ɪɴ ᴛʜᴇ ꜱᴏʟᴀʀ ꜱʏꜱᴛᴇᴍ. ɪᴛ ɪꜱ ᴀɴ ɪᴄᴇ ɢɪᴀɴᴛ. ɪᴛ ɪꜱ ᴛʜᴇ ᴛʜɪʀᴅ ʟᴀʀɢᴇꜱᴛ ᴘʟᴀɴᴇᴛ ɪɴ ᴛʜᴇ ꜱᴏʟᴀʀ ꜱʏꜱᴛᴇᴍ. ᴛʜᴇ ᴘʟᴀɴᴇᴛ ɪꜱ ᴍᴀᴅᴇ ᴏꜰ ɪᴄᴇ, ɢᴀꜱᴇꜱ ᴀɴᴅ ʟɪQᴜɪᴅ ᴍᴇᴛᴀʟ")
    val neptune = Planet("ＮＥＰＴＵＮＥ",11.15, "ɴᴇᴘᴛᴜɴᴇ ɪꜱ ᴛʜᴇ ᴇɪɢʜᴛʜ ᴀɴᴅ ꜰᴀʀᴛʜᴇꜱᴛ-ᴋɴᴏᴡɴ ꜱᴏʟᴀʀ ᴘʟᴀɴᴇᴛ ꜰʀᴏᴍ ᴛʜᴇ ꜱᴜɴ. ɪɴ ᴛʜᴇ ꜱᴏʟᴀʀ ꜱʏꜱᴛᴇᴍ, ɪᴛ ɪꜱ ᴛʜᴇ ꜰᴏᴜʀᴛʜ-ʟᴀʀɢᴇꜱᴛ ᴘʟᴀɴᴇᴛ ʙʏ ᴅɪᴀᴍᴇᴛᴇʀ, ᴛʜᴇ ᴛʜɪʀᴅ-ᴍᴏꜱᴛ-ᴍᴀꜱꜱɪᴠᴇ ᴘʟᴀɴᴇᴛ, ᴀɴᴅ ᴛʜᴇ ᴅᴇɴꜱᴇꜱᴛ ɢɪᴀɴᴛ ᴘʟᴀɴᴇᴛ. ɪᴛ ɪꜱ 17 ᴛɪᴍᴇꜱ ᴛʜᴇ ᴍᴀꜱꜱ ᴏꜰ ᴇᴀʀᴛʜ, ꜱʟɪɢʜᴛʟʏ ᴍᴏʀᴇ ᴍᴀꜱꜱɪᴠᴇ ᴛʜᴀɴ ɪᴛꜱ ɴᴇᴀʀ-ᴛᴡɪɴ ᴜʀᴀɴᴜꜱ")
    //Creating an array containing all the variables.
    var all = arrayOf(sun, earth, mercury, venus, mars, jupiter, saturn, uranus, neptune)
    var i = 0
    
    //Creating a function that prints all the information.
    fun printInfo(){
    //Name of the planet:
    println("Name: "+all[x].name +";")
    //Gravity of the planet:
    //Note: m/s²
    println("Surface gravity: "+all[x].gravity +" m/s²;")
    //Description of the planet:
    println("Description:\n"+all[x].info +"!")
    println("___  ___  ___\n" )
    x++
}
    //Trying the function.
    try{
    for(i in 0..all.size){ 
    printInfo()
    }}
    //If the program catch an error (here an exception), it will run.
    catch(exception: Exception){
        //This will print if the catch errors results true.
        println("🄴🅁🅁🄾🅁\nPlease try to run again, or check your internet connection, thanks!")
        println("___  ___  ___\n" )
    }
    //Last sentences :)
    println("\nFᵢₙᵢₛₕₑd ᵥᵢₛᵢₜ ₒf ₜₕₑ ᵤₙᵢᵥₑᵣₛₑ. ₕₒₚₑ yₒᵤ ₑₙⱼₒyₑd ᵢₜ ;₎\nComment your favorite ;)")
    println("\nᗷY Hritik ®")
}
