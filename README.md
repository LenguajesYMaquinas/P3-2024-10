# P3-2024-10

## ANOTACIONES:

- Se encontraron inconsistencias entre el enunciado y el programa de ejemplo, por ello, se modificaron algunas cosas del programa de ejemplo, como por ejemlo que en la ultima linea ( ( run - dirs : left : forward : left : back : right )) se usó en run-dirs forward, lo cual no es posible para run-dirs ya que recibe solo :front, :right, :left y :back, según el enunciado.

- Todo bloque de comandos (B) debe ir en entre parentesis [()] así este contenga solo un comando o varios.

## EJEMPLO DE PROGRAMA VALIDO:

(defvar rotate 3)

(defvar one 1)

(defun foo (c p)
	(= aa 3)
	(foo c p)
	(move 3)
	(turn :right)
	(face :north)
	(put :balloons 3)
	(pick :chips 3)
	(move-dir 3 :back)
	(run-dirs :front :front :right :left :back)
	(move-face 4 :east)
	(null)
	(if (can-move? :north)
		((turn :left) (turn :left))
		((turn :right))
	)
	(loop (can-move? :north)
		((turn :left) (turn :left))
	)
	(repeat 4(
			(if (can-move? :north)
				((turn :left) (turn :left))
				((turn :right))
			)
		)
	)
)


(defun goend ()
	(if (not (blocked?))
		((move one) (goend))
		((null))
	)
)


(defun fill ()
	(repeat Spaces(
				(if (not ( isZero? myChips )) 
					((put :chips 1)) 
					((null))
				)
			)
	)
)


(defun pickAllB ()
	(pick :balloons balloonsHere)
)


(
	(run-dirs :front :front :left :back :right)
)
(
	(if (can-move? :north ) 
		(( move-dir 1 :front )) 
		((null))
	)
)
(
	(if (not (blocked?)) 
		((move 1) (null))
		((turn :left))
	)
)
$
