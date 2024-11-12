<!doctype html>
<html lang="en">

<head th:fragment="head">
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>Demo</title>
    <meta name="description" content="" />
    <meta name="viewport" content="width=device-width" />
    <base href="/" />
    <link rel="stylesheet" type="text/css" href="/webjars/bootstrap/dist/css/bootstrap.min.css" />
    <script type="importmap">
        {
            "imports": {
                "bootstrap": "/npm/bootstrap",
                "@popperjs/core": "/npm/@popperjs/core",
                "htmx": "/webjars/htmx.org/1.6.0/dist/htmx.js"
            }
        }
    </script>
    <script type="module">
        import 'bootstrap';
        import '@popperjs/core';
        import 'htmx';
    </script>
    <script src="/webjars/htmx.org/1.6.0/dist/htmx.js"></script>
</head>
<body>
	<header th:fragment="header" class="m-2">
        <h1 class="text-center">Linear Algebra Calulator Test</h1>
    </header>
	<main>
        <!-- Div wrapper for module selector, pseudo navbar -->
        <div class="container-flex m-2">
            <div class="row d-flex flex-column justify-content-center align-items-center text-center m-2">
                <div class="col btn-group">
                    <a class="btn btn-primary"
                        hx-post="/matrix-module"
                        hx-trigger="click"
                        hx-target="#module-container"
                        hx-swap="innterHTML"
                    >Matrix Calculator</a>
                    <a class="btn btn-primary"
                        hx-post="/elimination-module"
                        hx-trigger="click"
                        hx-target="#module-container"
                        hx-swap="innterHTML"
                    >Elimination Calculator</a>
                    <a class="btn btn-primary"
                        hx-post="/vectorspace-module"
                        hx-trigger="click"
                        hx-target="#module-container"
                        hx-swap="innterHTML"
                    >Vectorspace(s) Calculator</a>
                </div>
            </div>
        </div>
        <!-- Div wrapper for the specific module to load into -->
        <div class="container mx-auto border border-primary border-3 justify-content-center align-items-center" id="module-container"> 
            <div class="container text-center">
                <p class="m-5 fs-4">
                    This is a proof of concept for the final project, similar to the hello world program you asked
                    for if we were going to create something like a minecraft mod. I realize that I'm using a 
                    framework that is incredibly advanced and the ~six hours I
                    spent making this has proven that. Like anything else, practice and familiarity with the
                    environment will make it easier to use and efficiency will grow with time.
                </p>
                <h2 class="text-center">Select a module to begin</h2>
            </div>
        </div>
	</main>
</body>
</html>