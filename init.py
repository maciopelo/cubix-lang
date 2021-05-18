initial_html = """
<html> 
    <head> 
        <title>My first X3DOM page</title> 			
        <script type='text/javascript' src='http://www.x3dom.org/download/x3dom.js'> </script> 
        <link rel='stylesheet' type='text/css' href='http://www.x3dom.org/download/x3dom.css'></link> 
    </head> 
        <body> 
        <h1>Cubix</h1> 
        <x3d width='1200px' height='800px'> 
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
            <button id="prevMoveBtn">Prev</button>
            <button id="nextMoveBtn">Next</button>
        </body>
"""