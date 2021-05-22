initial_html = """
<html> 
    <head> 
        <title>My first X3DOM page</title> 			
        <script type='text/javascript' src='http://www.x3dom.org/download/x3dom.js'> </script> 
        <link rel='stylesheet' type='text/css' href='http://www.x3dom.org/download/x3dom.css'></link>
        <link rel='stylesheet' type='text/css' href='style.css'></link>
    </head> 
        <body onload="handleMovesSpanChange();">
        <h1 class="langTitle">Cubix</h1>
        <div class="container">
        <div class="x3dom-wrapper">

        <div class="moves-wrapper">
            <p id="prevMoveSpan"></p>
            <p id="nextMoveSpan"></p>
        </div> 
        <x3d width='1100px' height='700px'> 
            <scene>

"""

colors_initialization = """
<!--- def. and init. of black element with cords (0,0,0) --->
            <group DEF="blackElement"> 
                <shape> 
                    <appearance> 
                        <material diffuseColor='0 0 0'/>
                    </appearance> 
                    <box size='1, 1, 1'/>
                </shape> 
            </group>
            
            <group DEF="orangeElement"> 
                <shape> 
                    <appearance> 
                        <material diffuseColor='1 0.35 0'/>
                    </appearance> 
                    <box size='0.9, 0.9, 0.9'/>
                </shape> 
            </group>

            <group DEF="redElement"> 
                <shape> 
                    <appearance> 
                        <material diffuseColor='0.96 0.04 0.04'/>
                    </appearance> 
                    <box size='0.9, 0.9, 0.9'/>
                </shape> 
            </group>

            <group DEF="blueElement"> 
                <shape> 
                    <appearance> 
                        <material diffuseColor='0.04 0.04 0.96'/>
                    </appearance> 
                    <box size='0.9, 0.9, 0.9'/>
                </shape> 
            </group>

            <group DEF="greenElement"> 
                <shape> 
                    <appearance> 
                        <material diffuseColor='0.16 0.56 0.17'/>
                    </appearance> 
                    <box size='0.9, 0.9, 0.9'/>
                </shape> 
            </group>

            <group DEF="whiteElement"> 
                <shape> 
                    <appearance> 
                        <material diffuseColor='1 1 1'/>
                    </appearance> 
                    <box size='0.9, 0.9, 0.9'/>
                </shape> 
            </group>

            <group DEF="yellowElement"> 
                <shape> 
                    <appearance> 
                        <material diffuseColor='1 1 0'/>
                    </appearance> 
                    <box size='0.9, 0.9, 0.9'/>
                </shape> 
            </group>

"""

ending_html = """
            </scene>
                
            </div>

                <div class="buttons-wrapper">
                        <button id="prevMoveBtn">Prev</button>
                        <button id="nextMoveBtn">Next</button>
                </div>
            </div>
        </body>
"""



js_script = """ 
            const COLORS = {
                "red": "0.96 0.04 0.04",
                "green": "0.16 0.56 0.17",
                "blue": "0.04 0.04 0.96",
                "yellow": "1 1 0",
                "white": "1 1 1",
                "orange": "1 0.35 0",
            }
            
            let currentState = 0
            let currentMove = 0

            const prevMoveBtn = document.querySelector("#prevMoveBtn")
            const nextMoveBtn = document.querySelector("#nextMoveBtn")

            const prevMoveSpan = document.querySelector("#prevMoveSpan")
            const nextMoveSpan = document.querySelector("#nextMoveSpan")

            const nextMoveSpanText = document.querySelector("#nextMoveSpanText")
            const prevMoveSpanText = document.querySelector("#prevMoveSpanText")


            nextMoveBtn.onclick = function() {

                if(currentMove < moves.length){
                    currentMove += 1;
                    console.log(currentMove);
                    handleMovesSpanChange();
                }

                if(currentState !== states.length-1){
                    currentState += 1;
                    const nextMoveSetting = states[currentState];
                    handleCubeColorsChange(nextMoveSetting);
                }
            }


            prevMoveBtn.onclick = function() {

                if(currentMove > 0 ){
                    currentMove -= 1;
                    console.log(currentMove);
                    handleMovesSpanChange();
                }

                if(currentState !== 0){
                    currentState -= 1;
                    const nextMoveSetting = states[currentState];
                    handleCubeColorsChange(nextMoveSetting);
                }
            }

            

            function handleCubeColorsChange(givenState){
                for (const side in givenState) {
                    if (Object.hasOwnProperty.call(givenState, side)) {
                        const sideColors = givenState[side];
                        sideColors.forEach( (color, index) => {
                            const cubeSquareToChange = document.querySelector(`#${side}Square${index}Color`)
                            cubeSquareToChange.setAttribute("diffuseColor",COLORS[color])
                        })
                    }
                }
            }



            function handleMovesSpanChange(){
                if(Boolean(moves[currentMove-1])){
                    prevMoveSpan.innerHTML = "Prev move: "+ "<span style='font-weight: bold'>"+moves[currentMove-1]+"</span>"
                    prevMoveBtn.disabled = false
                }else{
                    prevMoveBtn.disabled = true
                    prevMoveSpan.innerHTML = ""
                }

                if(Boolean(moves[currentMove])){
                    nextMoveSpan.innerHTML = "Next move: "+ "<span style='font-weight: bold'>"+moves[currentMove]+"</span>"
                    nextMoveBtn.disabled= false
                }else{
                    nextMoveBtn.disabled= true
                    nextMoveSpan.innerHTML = ""
                }
                
            }
        
"""