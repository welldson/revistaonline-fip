<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- You'll want to use a responsive image option so this logo looks good on devices - I recommend using something like retina.js (do a quick Google search for it and you'll find it) -->
                <a class="navbar-brand" href="${linkTo[IndexController].index}">Revista Online FIP</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="${linkTo[UsuarioController].formulario}">Cadastro</a></li>
                   
                    <li><a href="#">Sobre</a></li>
                    <li><a href="#">Services</a>
                    </li>
                    <li><a href="#">Contact</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Portfolio <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">1 Column Portfolio</a>
                            </li>
                            <li><a href="#">2 Column Portfolio</a>
                            </li>
                            <li><a href="#">3 Column Portfolio</a>
                            </li>
                            <li><a href="#">4 Column Portfolio</a>
                            </li>
                            <li><a href="#">Single Portfolio Item</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Blog <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Blog Home 1</a>
                            </li>
                            <li><a href="#">Blog Home 2</a>
                            </li>
                            <li><a href="#">Blog Post</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Other Pages <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Full Width Page</a>
                            </li>
                            <li><a href="#">Sidebar Page</a>
                            </li>
                            <li><a href="#">FAQ</a>
                            </li>
                            <li><a href="#">404</a>
                            </li>
                            <li><a href="#">Pricing Table</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>